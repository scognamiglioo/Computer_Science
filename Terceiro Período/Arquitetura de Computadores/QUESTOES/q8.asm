# Associações:  x -> $s0 
# inicio 

.text
.globl main
main:

ori $8, $zero, 0x1234	# x00001234
sll $8, $8, 16		# x12340000
ori $8, $8, 0x5678	# x12345678
srl $9, $8, 24		# $9 - x12
sll $10, $8, 8
srl $10,$10, 24  	# $10 - 34
sll $11, $8, 16
srl $11,$11,24 	# $10 - 56
sll $12, $8, 24
srl $12,$12,24 	# $10 - 78




#fim
