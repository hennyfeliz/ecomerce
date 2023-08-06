
import './Styles.css'

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
          <span>  Categories</span>
          <span>  Sale</span>
          <span>  New</span>
          <span>  Popular</span>
          <span>  Explore</span>
        </div>
        <div className="header-search">
          <input type='text' placeholder='Search Prooduct' />
          <span>Account</span>
          <span>Cart</span>
        </div>
      </header>
    </>
  )
}

export default Header