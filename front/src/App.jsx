import './App.css'
import Header from './components/Header/Header'
import Elements from './components/Elements/Elements'
import { BrowserRouter, Route, Routes } from "react-router-dom"
import Login from './components/Login/Login'
import UserDashboard from './components/UserDashBoard/UserDashboard'

function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={
            <>
              <Header />
              <Elements />
            </>
          } />
          <Route path="/login" element={<Login />} />
          <Route path="/user" element={<UserDashboard />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
