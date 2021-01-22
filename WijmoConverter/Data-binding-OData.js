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


class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            customers: new ODataCollectionView("https://services.odata.org/Northwind/Northwind.svc", "Customers", {
                sortOnServer: true,
                filterOnServer: true
            }),

            itemCount: ""
        };
    }
    render() {
        return (<div className="container-fluid">
        <p>{this.state.itemCount}</p>
        <FlexGrid itemsSource={this.state.customers} isReadOnly={true} initialized={this.flexInitialized.bind(this)}>
          <FlexGridFilter />
        </FlexGrid>
      </div>);
    }

    flexInitialized(flexgrid) {
        flexgrid.loadedRows.addHandler(() => {
            this.setState({
                itemCount: flexgrid.rows.length + " items"
            });
        });
    }
}

export default App;
