import React, { useEffect,useState } from 'react'
import axios from 'axios';

const App = () => {
  const [data, setdata] = useState([])
  const [search, setsearch] = useState('')
  useEffect(()=>{
   async function get_data() {
      try {
        const get_res=await axios.get("http://localhost:2323/get_data")
        console.log(get_res.data);
        setdata(get_res.data);
      } catch (error) {
        console.log(error);
      }
    }
    get_data()
  },[])

function get_search(e) {
  e.preventDefault();
   
  useEffect(()=>{
        async function get_item(search) {
        try {
          const item=await axios.get(`http://localhost:2323/search_data/${search}`);
          console.log(item.data);
              
        } catch (error) {
          console.log(error);
        }
    }
    get_item()
},[search])
}
  return (
    <div style={{backgroundColor:"aquamarine"}}>
      {data.map((index,i)=>(
        <div className="info" key={i} style={{backgroundColor:"blue", color:"white", width:"167px"  }}>
           <h6>{index.id}</h6>
           <h4>{index.name}</h4>
           <span>{index.sec}</span>
           <p>{index.add}</p>
        </div>
      ))}
      <div className="input">
        <form onSubmit={get_search}>
        <input type='text' placeholder='enter to search' 
         value={search}
        onChange={(e)=>(
          setsearch(e.target.value)
         )}
        />
        <button>Serach</button>
        </form>
      </div>
    </div>
  )
}

export default App
