public void someInterestingMethod( int x ) {	
	try {            
		DataInputStream in = new DataInputStream(req.getInputStream());            
		HttpSession session = req.getSession(true);
		//Read Input Data
		in.close();		
	} catch ( Exception err ) { }
	outputStream.close();	
}