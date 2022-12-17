/*
 Guia_0205
*/
module Guia_0205;

// define data
 reg [7:0] a; // binary
 reg [7:0] b; // binary
 reg [7:0] c;

// actions
 initial
 begin : main

 $display ( "Guia_0205 - Tests" );

 //--------------------------------------------------------------//
 a = 8'b0101_0010 ; // binary
 b = 8'b011_0011 ; // binary


 $display ( "a = %8b", a );
 $display ( "b = %8b", b );
 c = a+b;
 $display ( "a = a+b = %8b", c );

$display ( "---------------------------------------------- ");

//--------------------------------------------------------------//
 a = 8'b1001_1110 ; // binary
 b = 8'b0010_0011 ; // binary


 $display ( "a = %8b", a );
 $display ( "b = %8b", b );
 c = a-b;
 $display ( "b = a-b = %8b", c );
 c = b-a;
 $display ( "b = b-a = %8b", c );
 $display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

 a = 8'b0100_0110 ; // binary
 b = 8'b0011_0001 ; // binary

 $display ( "a = %8b", a );
 $display ( "b = %8b", b );

 c = a*b;
 $display ( "c = a*b = %8b", c );

 $display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

 a = 8'b1010_0010 ; // binary
 b = 8'b0010_0101 ; // binary

 $display ( "a = %8b", a );
 $display ( "b = %8b", b );

 c = b/a;
 $display ( "d = b/a = %0b", c );
 $display ( "---------------------------------------------- ");

//--------------------------------------------------------------//

 a = 8'b11010010 ; // binary
 b = 8'b00000101 ; // binary

 $display ( "a = %8b", a );
 $display ( "b = %8b", b );

 c = b%a;
 $display ( "e = b%%a = %8b", c );


end // main
endmodule // Guia_020