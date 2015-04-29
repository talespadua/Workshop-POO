from personagem import Personagem, Npc

def main():
    luquinha = Personagem("luquinha", 10, 11)
    lek_doido = Personagem("lek_doido", 1, 0)

    jebediah = Npc("Jebediah", 5, 5, 100)
    jebediah.sou_estupido()
    jebediah.print_name()

    luquinha.set_vidas(5)
    luquinha.print_name()
    lek_doido.print_name()

if __name__ == "__main__":
    main()