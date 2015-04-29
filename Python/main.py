from personagem import Personagem, Npc

def do_the_duck(object):
    object.print_name()

def main():
    luquinha = Personagem("luquinha", 10, 11)
    lek_doido = Personagem("lek_doido", 1, 0)

    jebediah = Npc("Jebediah", 5, 5, 100)

    luquinha.print_name()
    lek_doido.print_name()
    jebediah.print_name()

    do_the_duck(jebediah)
    do_the_duck(luquinha)

if __name__ == "__main__":
    main()