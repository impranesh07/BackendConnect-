import React, { useEffect, useState } from 'react'
import axios from 'axios'

const App = () => {
  const [roll, setdata] = useState('');
  const [name, setname] = useState('');
  const [sec, setsec] = useState('');
  const [add, setadd] = useState('');
  const [insert, setinsert] = useState()
  /* */
  const [submit, setsubmit] = useState(false)

  function handler(e) {
    e.preventDefault();

    const payload = {
    roll: Number(roll), // Ensures it's an int for Spring Boot
    name: name,
    sec:sec,   // Ensures it's an int for Spring Boot
    add: add
    };

   setinsert(payload);

   console.log(payload);
   
  setsubmit(true);

   // 4. Clear inputs
  setdata('');
  setname('');
  setsec('');
  setadd('');

 

  }
  useEffect( ()=>{
    if (submit && insert) {
      async function senddata() {
    try {
    const send=await axios.post("http://localhost:9091/data",insert);
     //console.log(send.data);
    } catch (error) {
      console.log(error)
    }  }

      senddata();
  }
  },[submit,insert])

   /*private  int roll;
    private String name;
    private  int sec;
    private String add;  */
  return (
    <div>
      <form onSubmit={handler}>
        Roll:-<input type='text'  placeholder='enter roll' 
       value={roll}
       onChange={(elem)=>(
        setdata(elem.target.value)
        )}/>
         Name:-<input type='text'  placeholder='enter name' 
       value={name}
       onChange={(elem)=>(
        setname(elem.target.value)
        )}/>
         sec:-<input type='text'  placeholder='enter sec' 
       value={sec}
       onChange={(elem)=>(
        setsec(elem.target.value)
        )}/>
         Add:-<input type='text'  placeholder='enter address' 
       value={add}
       onChange={(elem)=>(
        setadd(elem.target.value)
        )}/>
        <button>Submit</button>
      </form>
    </div>
  )
}

export default App
