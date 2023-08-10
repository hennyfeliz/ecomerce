
import '../../Styles/Header.css'
import search from './header_assets/search.svg'
import cart from './header_assets/cart.svg'
import user from './header_assets/user-1.svg'

const Header = () => {
  return (
    <>
      <header>
        <div className="header-title">
          <h1>
            Strada
          </h1>
        </div>
        <div className="header-categories">
          <span>Categories</span>
          <span>Sale</span>
          <span>New</span>
          <span>Popular</span>
          <span>Explore</span>
        </div>
        <div className="header-search">
          <div className="input-text-container">
            <input type='text' placeholder='Search Prooduct' />
            <img
              src={search}
              alt="search-icon"
              style={{ width: "24px", height: "24px" }}
            />
          </div>
          <div className="right-side-header-container">
            <img
              src={user}
              alt="user-icon"
              style={{ width: "24px", height: "24px" }}
            />
            <img
              src={cart}
              alt="cart-icon"
              style={{ width: "24px", height: "24px" }}
            />
          </div>
        </div>
      </header>
    </>
  )
}

export default Header