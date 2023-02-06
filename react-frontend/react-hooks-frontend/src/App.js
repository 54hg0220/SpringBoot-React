import './App.css';
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponet from './components/FooterComponet';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AddEmployeeComponent from './components/AddEmployeeComponent';

function App() {
  return (
    <div>
      <BrowserRouter>
        <HeaderComponent/>
        <div className='container'>
          <Routes>
          <Route path="/" element={<ListEmployeeComponent/>} />
          <Route path="/employees" element={<ListEmployeeComponent/>} />
          <Route path="/add-employee" element={<AddEmployeeComponent/>} />
          <Route path="/edit-employee/:id" element={<AddEmployeeComponent/>} />
          </Routes>
        </div>
        <FooterComponet/>
      </BrowserRouter>
    </div>
  );
}

export default App;
