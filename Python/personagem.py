class Personagem(object):
    velocidade = 5

    def move_left(self):
        self.posX = self.posX - self.velocidade

    def move_right(self):
        self.posX = self.posX + self.velocidade

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

    def set_vidas(self, numVidas):
        self.numVidas = numVidas

class Npc(Personagem):
    def __init__(self, nome, posX, posY, estupidez):
        Personagem.__init__(self, nome, posX, posY)
        self.estupidez = estupidez

    def sou_estupido(self):
        if self.estupidez > 10:
            print("Meu nome é " + self.nome + ", e sou estúpido")
        else:
            print("Meu nome é " + self.nome + ", e sou inteligentão")

    def get_estupidez(self):
        return self.estupidez