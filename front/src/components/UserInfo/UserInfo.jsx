
import { Link } from 'react-router-dom';
import './UserInfo.css'; // Importa tus estilos CSS
import logout from './assets/logout.svg'
import UserDashboard from '../UserDashBoard/UserDashboard';
import { useState } from 'react';


const UserInfo = () => {

  const [isModalOpen, setIsModalOpen] = useState(false);

  const openModal = () => {
    setIsModalOpen(true);
  };

  const closeModal = () => {
    setIsModalOpen(false);
  };
  return (
    <>
      <div className="user-info" >
        <h2>Información</h2>
        <span onClick={openModal}>
          Perfil de usuario
        </span>
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
      <UserDashboard
        isOpen={isModalOpen}
        closeModal={closeModal}
      />
    </>
  );
}

export default UserInfo