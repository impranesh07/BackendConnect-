import React, { useEffect, useState } from 'react'
import axios from 'axios';



const App = () => {
  const [data, setdata] = useState([])
  useEffect(()=>{
   async function get_data() {
      try {
        const response=await axios.get("http://localhost:1200/get_data");
        setdata(response.data);
      } catch (error) {
        console.log(error);
      }
    }
    get_data()
},[])
function delete_data(elem) {
  try {
    const delete_res=axios.put(`http://localhost:1200/delete_res/${elem}`);
    console.log(delete_res);
    
    window.location.reload();
  } catch (error) {
    console.log(error);
  }
}
  return (
    <div>
      <div className="show">
       {data.map((e,index)=>(
        <div className="card" style={{backgroundColor:"blue", color:"white"}} key={index}>
           <p>{e.id}</p>
           <h1>{e.name}</h1>
           <h6>{e.sec}</h6>
           <p>{e.add}</p>
           <button onClick={()=>(
            delete_data(e.id)
           )}>Delete</button>
        </div>        
       ))}
      </div>
    </div>
  )
}

export default App
