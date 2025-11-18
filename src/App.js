import { RouterProvider,createBrowserRouter } from 'react-router-dom';
import './App.css';
import Home from './pages/Home';
import About from './pages/About';
import Contact from './pages/Contact';
import Product from './pages/Product';
const router=createBrowserRouter([
 
  {path:"/",element:<Home/>},
  {path:"/about",element:<About/>},
  {path:"/contact",element:<Contact/>},
  {path:"/Product",element:<Product/>}
  
])
function App() {
  return (
    <RouterProvider router={router}/>
  );
}


export default App;
