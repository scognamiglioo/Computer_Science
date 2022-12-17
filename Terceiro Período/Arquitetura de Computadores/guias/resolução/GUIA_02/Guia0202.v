/*
 Guia_0202
*/
module Guia_0202;
// define data
 real x = 0; // decimal
 integer y = 7 ; // counter
 reg [7:0] b = 0 ; // binary

// actions

 initial
 begin : main

 $display ( "Guia_0202 - Tests" );

//--------------------------------------------------------------//
 x = 0.625;
 $display ( "x = %f" , x );

 while ( x > 0 && y >= 0 )
 begin

 if ( x*2 >= 1 )
 begin
 b[y] = 1;
 x = x*2.0 - 1.0;
 end

 else
 begin
 b[y] = 0;
 x = x*2.0;

 end // end if
 y=y-1;

end // end while
$display ( "a = 0.%8b", b );
$display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

x = 1.125;
 $display ( "x = %f" , x );

 while ( x > 0 && y >= 0 )
 begin

 if ( x*2 >= 1 )
 begin
 b[y] = 1;
 x = x*2.0 - 1.0;
 end

 else
 begin
 b[y] = 0;
 x = x*2.0;

 end // end if
 y=y-1;

end // end while
$display ( "b = 0.%8b", b );
$display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

x = 1.03125;
 $display ( "x = %f" , x );

 while ( x > 0 && y >= 0 )
 begin

 if ( x*2 >= 1 )
 begin
 b[y] = 1;
 x = x*2.0 - 1.0;
 end

 else
 begin
 b[y] = 0;
 x = x*2.0;

 end // end if
 y=y-1;

end // end while
$display ( "c = 0.%8b", b );
$display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

x = 3.87500;
 $display ( "x = %f" , x );

 while ( x > 0 && y >= 0 )
 begin

 if ( x*2 >= 1 )
 begin
 b[y] = 1;
 x = x*2.0 - 1.0;
 end

 else
 begin
 b[y] = 0;
 x = x*2.0;

 end // end if
 y=y-1;

end // end while
$display ( "d = 0.%8b", b );
$display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

x = 11.37500;
 $display ( "x = %f" , x );

 while ( x > 0 && y >= 0 )
 begin

 if ( x*2 >= 1 )
 begin
 b[y] = 1;
 x = x*2.0 - 1.0;
 end

 else
 begin
 b[y] = 0;
 x = x*2.0;

 end // end if
 y=y-1;

end // end while
$display ( "e = 0.%8b", b );
$display ( "---------------------------------------------- ");

end // main
endmodule // Guia_0202