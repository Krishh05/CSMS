import React, { useEffect, useState } from 'react'
import { toast } from 'react-toastify';
import { getCurrentUser } from '../../../../../services/auth';
import { privateAxios } from '../../../../../services/helper';

function ViewShipments() {
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    const id = getCurrentUser().userId;
    privateAxios.get(`/client/active_orders/${id}`)
      .then(response => {
        setOrders(response.data);
        console.log(response)
      })
      .catch(response => {
        toast.error('There was an error getting your current shipments. Please try again.')
      })
  }, [])

  return (
    <div className='container my-5'>
      <h3 className='utext my-5'>Your Current Shipments</h3>
      <table className='table'>
        <thead>
          <tr>
            <th scope='col'>Sender</th>
            <th scope='col'>Receiver</th>
            <th scope='col'>Order Date</th>
            <th scope='col'>Delivery Date</th>
            <th scope='col'>Tracking Number</th>
            <th scope='col'>Service Type</th>
            <th scope='col'>Status</th>
          </tr>
        </thead>
        <tbody>
          {orders[0]!==null && orders.map(order => (
            <tr key={order.orderId}>
              <td>{order.senderId.firstName} {order.senderId.lastName}</td>
              <td>{order.receiverId.firstName} {order.receiverId.lastName}</td>
              <td>{order.orderDate}</td>
              <td>{order.deliveryDate}</td>
              <td>{order.trackingNumber}</td>
              <td>{order.serviceType}</td>
              <td>{order.status}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default ViewShipments