/**
 * 
 * https://www.grapecity.com/wijmo/demos/Grid/Data-binding/ODataAPI/react
 * 
 * **/


import 'bootstrap/dist/css/bootstrap.min.css'
import '@grapecity/wijmo.styles/wijmo.css';
import './App.css';
import { FlexGrid, FlexGridColumn } from '@grapecity/wijmo.react.grid';
import { ODataCollectionView } from '@grapecity/wijmo.odata';
import React, {useState, useEffect} from 'react'; 
import { FlexGridFilter } from '@grapecity/wijmo.grid.filter';

const App = () => {

  // const [customer, setCustomer] = useState(new ODataCollectionView("https://services.odata.org/Northwind/Northwind.svc", "Customers", {
  //   sortOnServer: true,
  //   filterOnServer: true );
  const [itemCount, setItemCount] = useState('');
  const customer =new ODataCollectionView("https://services.odata.org/Northwind/Northwind.svc", "Customers", {
      sortOnServer: true,
      filterOnServer: true });

  useEffect(()=>{
        
  }); 

  const flexInitialized = (props) => {
    props.loadedRows.addHandler(()=> {
      setItemCount(props.rows.length); 
      console.log(props.rows.length)
    })
  }


  return(
    <div className="container-fluid">
       <p>{itemCount}</p>
       <FlexGrid initialized={flexInitialized}  itemSource = {customer} isReadOnly = {true}>
          {/* <FlexGridFilter /> */}
       </FlexGrid>
    </div>
  )
};

export default App;
