# Associações:  x -> $s0 
# inicio 

.text
.globl main
main:

addi $s0, $zero, 1  # x

add $t0, $s0, $s0
add $t0, $t0, $t0
add $t0, $t0, $t0
add $t0, $t0, $t0
sub $s1, $t0, $s0

#fim
