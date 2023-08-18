

/* eslint-disable no-undef */

import { Link } from 'react-router-dom';
import './ShoppingCart.css'; // Importa tus estilos CSS
import icon from '../Elements/assets/error.svg'
import trash from '../../assets/delete.svg'; // Delete

const ShoppingCart = () => {

  const products = [
    {

    }, {

    }, {

    }, {

    }
  ]

  return (
    <div className="shopping-info" >
      <h3>Productos</h3>
      {
        products.map((item, index) => {
          return (
            <>
              <div key={index} className="shopping_cart_element">
                <img
                  style={{ width: '70px', height: '70px' }}
                  src={icon}
                />
                <div className="product-content">
                  <span>zapatos</span>
                  <span>$300.00us</span>
                </div>
                <img
                  className="trash-button"
                  style={{ width: '24px', height: '24px' }}
                  src={trash}
                  alt='trash-icon'
                />
              </div>
              <hr />
            </>
          )
        })
      }

      {/* <hr style={{ margin: "4px 0" }} /> */}
      <Link to={'/login'}>
        <div className="logout-cont">
          {/* <img
            alt='logout-icon'
            style={{ width: '28px', height: '28px' }}
            src={logout}
          /> */}
          <span onClick={() => new AWN().info('Session closed')}>ver todos los productos</span>
        </div>
      </Link>
    </div>
  );
}

export default ShoppingCart