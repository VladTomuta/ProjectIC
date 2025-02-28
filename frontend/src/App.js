// import "./App.css";
import SignUp from "./pages/SignUp/SignUpPage";
import HomePage from "./pages/HomePage/HomePage";
import LogInPage from "./pages/LogIn/LogInPage";
import AdminPage from "./pages/Admin/AdminPage";
import AddBookPage from "./pages/AddBook/AddBookPage";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import React from "react";
import LoggedInHomePage from "./pages/LoggedInHomePage/LoggedInHomePage";
import AllBooksPage from "./pages/AllBooksPage/AllBooksPage";

function App() {
	return (
			<Router>
				<Routes>
					<Route path="/" element={<HomePage />} />
					<Route path="/login" element={<LogInPage />} />
					<Route path="/signup" element={<SignUp />} />
					<Route path="/admin" element={<AdminPage />} />
					<Route path="/loggedIn" element={<LoggedInHomePage />} />
					<Route path="/addBook" element={<AddBookPage />} />
					<Route path="/availableBooks" element={<AllBooksPage />} />
				</Routes>
			</Router>
	);
}

export default App;