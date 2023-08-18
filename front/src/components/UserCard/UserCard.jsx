import './UserCard.css'; // Importa tus estilos CSS
import { useState } from 'react';


const UserCard = ({user}) => {
  const [isHovered, setIsHovered] = useState(false);

  const handleMouseEnter = () => {
    setIsHovered(true);
  };

  const handleMouseLeave = () => {
    setIsHovered(false);
  };

  return (
    <div
      className="user-card"
      onMouseEnter={handleMouseEnter}
      onMouseLeave={handleMouseLeave}
    >
      <div className="user-details">
        <h2>{user.name}</h2>
        <p>{user.email}</p>
      </div>
      {isHovered && (
        <div className="user-modal">
          {/* Contenido del modal */}
          <p>Detalles adicionales del usuario</p>
        </div>
      )}
    </div>
  );
}

export default UserCard;
