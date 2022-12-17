module Guia_0201;

// define data
real
x = 0 ; // decimal
real power2 = 1.0; // power of 2
integer
y = 7 ; // counter
reg [15:0] b = 16'b00000000_00000000; // binary (only fraction part, Big Endian)

// actions
initial
begin : main
$display ( "Guia_0201 - Tests" );

//Letra A
x = 0 ; // decimal
power2 = 1.0; // power of 2
y = 7 ; // counter
b = 16'b00000000_10101000; // binary (only fraction part, Big Endian)

while ( y >= 0 )
begin
power2 = power2 / 2.0;
if ( b[y] == 1 )
begin
x = x + power2;
end
y=y-1;
end // end while

$display ( "a.) x = %f", b[15:8] + x );

//Letra B
x = 0 ; // decimal
power2 = 1.0; // power of 2
y = 7 ; // counter
b = 16'b00000000_01101000; // binary (only fraction part, Big Endian)
while ( y >= 0 )
begin
power2 = power2 / 2.0;
if ( b[y] == 1 )
begin
x = x + power2;
end
y=y-1;
end // end while

$display ( "b.) x = %f", b[15:8] + x );

//Letra C
x = 0 ; // decimal
power2 = 1.0; // power of 2
y = 7 ; // counter
b = 16'b00000000_11101000; // binary (only fraction part, Big Endian)
while ( y >= 0 )
begin
power2 = power2 / 2.0;
if ( b[y] == 1 )
begin
x = x + power2;
end
y=y-1;
end // end while

$display ( "c.) x = %f", b[15:8] + x );

//Letra D
x = 0 ; // decimal
power2 = 1.0; // power of 2
y = 7 ; // counter
b = 16'b00000001_10111000; // binary (only fraction part, Big Endian)
while ( y >= 0 )
begin
power2 = power2 / 2.0;
if ( b[y] == 1 )
begin
x = x + power2;
end
y=y-1;
end // end while

$display ( "d.) x = %f", b[15:8] + x );

//Letra E
x = 0 ; // decimal
power2 = 1.0; // power of 2
y = 7 ; // counter
b = 16'b00000011_11110000; // binary (only fraction part, Big Endian)
while ( y >= 0 )
begin
power2 = power2 / 2.0;
if ( b[y] == 1 )
begin
x = x + power2;
end
y=y-1;
end // end while

$display ( "e.) x = %f", b[15:8] + x );

end // main
endmodule // Guia_0201