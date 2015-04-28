class Personagem:
	velocidade = 5

	def move_left(self):
		self.posX = self.posX - velocidade

	def move_right(self):
		self.posX = self.posX + velocidade

	def get_posX(self):
		return self.__posX

	def get_posY(self):
		return self.__posY

	def __init__(self, nome, posX, posY):
		self.numVidas = 2
		self.nome = nome
		self.__posX = posX
		self.__posY = posY
		self.print_name();

	def print_name(self):
		print("My name is: " + self.nome)
		print("I have: " + str(self.numVidas) + " lives")