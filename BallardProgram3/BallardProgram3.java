class BallardProgram3
{
	public void start()
	{
		//roll a 12 cided dice
		int roll = ct.random( 1, 12 );
		ct.log( roll );

		//User to input their name
		String name = ct.inputString( "Please Enter Your Name" );
		ct.log( name );

		//user input age
		String age = ct.inputString( "Please Enter Your Age");
		ct.log ( age );
		

		


	}
}
