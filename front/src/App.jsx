import { useState } from 'react'
import './App.css'
import Header from './components/Header/Header'
import Elements from './components/Elements/Elements'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Header />
      <Elements />
    </>
  )
}

export default App
