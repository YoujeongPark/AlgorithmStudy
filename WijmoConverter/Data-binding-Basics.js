/** 
 * 
 * https://www.grapecity.com/wijmo/demos/Grid/Data-binding/Basics/react
 * 
 * **/

import 'bootstrap/dist/css/bootstrap.min.css'
import '@grapecity/wijmo.styles/wijmo.css';
import './App.css';
//
import * as ReactDOM from 'react-dom';
import { FlexGrid, FlexGridColumn } from '@grapecity/wijmo.react.grid';
import { format, SortDescription, CollectionView } from "@grapecity/wijmo";
import React, {useState, useEffect} from 'react'; 

const App = () => {

  const [data, setData] = useState([]);
  const [selectedItem, setSelectedItem] = useState('');
  const [flexGrid, setFlexGrid] = useState(''); 

  useEffect(()=>{
      setData(getData);     
  }); 

  const updateCurrentInfo = () => {
      setSelectedItem(flexGrid.collectionView.currentItem).format("Country: <b>{country}</b>, Sales: <b>{sales:c0}</b> Expenses: <b>{expenses:c0}</b>")
  }

  //     flexInitialized(flexgrid) {
//         this.flex = flexgrid;
//         // sort the data by country
//         let sd = new SortDescription("country", true);
//         flexgrid.collectionView.sortDescriptions.push(sd);
//         flexgrid.collectionView.currentChanged.addHandler(this.updateCurrentInfo.bind(this));
//         this.updateCurrentInfo();
//     }

  const flexInitialized = (flexGrid) => 
  {   setFlexGrid(flexGrid);
      let sd = new SortDescription("country", true);
      flexGrid.collectionView.sortDescriptions.push(sd);
      flexGrid.collectionView.currentChanged.addHandler(updateCurrentInfo);
      // props.collectionView.sortDescriptions.push(sd);
      // props.collectionView.currentChanged.addHandler(updateCurrentInfo.bind(flexGrid));
      updateCurrentInfo();
  }


  const getData = () =>{
        // create some random data
        let countries = "US,Germany,UK,Japan,Italy,Greece".split(","), data = [];
        for (let i = 0; i < countries.length; i++) {
            data.push({
                id: i,
                country: countries[i],
                sales: Math.random() * 10000,
                expenses: Math.random() * 5000
            });
        }
        return data;
  }

  return(
    <div className="container-fluid">
       <p dangerouslySetInnerHTML={{ __html: selectedItem}}/>
       <FlexGrid initialized={flexInitialized}  itemSource = {data}>
                <FlexGridColumn header="Country" binding="country" width="2*"/>
                <FlexGridColumn header="Sales" binding="sales" width="*" format="n2"/>
                <FlexGridColumn header="Expenses" binding="expenses" width="*" format="n2"/>
       </FlexGrid>
    </div>
  )
};

export default App;