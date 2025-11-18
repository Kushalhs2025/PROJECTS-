import { Link } from "react-router-dom";


const Navigation = ()=>
    {
    return(
        <>
                <Link to='/' className="my-link">Home</Link>
                <Link to='/about' className="my-link">About</Link>
                <Link to='/contact' className="my-link">Contact</Link>
                <Link to='/product' className="my-link">Product</Link>

        </>
    )
    

    

}
export default Navigation;
