# Associações:  x -> $s0 
# inicio 

.text
.globl main
main:

addi $s0, $zero, 2  # a 
addi $s1, $zero, 3  # b 
addi $s2, $zero, 4  # c 
addi $s3, $zero, 5  # d 
add $t0, $s0, $s1 #t = a + b
add $t2, $s2, $s3 #t = c + d
sub $s3, $t0, $t2
sub $s0, $s0, $s1 # a = a - b
add $s4, $s0, $s3
sub $s1, $s3, $s4



#fim
