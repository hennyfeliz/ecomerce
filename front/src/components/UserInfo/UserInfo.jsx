/* eslint-disable no-undef */

import { Link } from 'react-router-dom';
import './UserInfo.css'; // Importa tus estilos CSS
import logout from './assets/logout.svg'

const UserInfo = () => {

  return (
    <div className="user-info" >
      <h2>Información</h2>
      <span>Perfil de usuario</span>
      <span>Productos pasados</span>
      <span>Configuración de usuario</span>
      <span>Otros</span>
      <hr style={{ margin: "4px 0" }} />
      <Link to={'/login'}>
        <div className="logout-cont">
          <img
            alt='logout-icon'
            style={{ width: '28px', height: '28px' }}
            src={logout}
          />
          <span onClick={() => new AWN().info('Session closed')}>Cerrar seción</span>
        </div>
      </Link>
    </div>
  );
}

export default UserInfo