frase_yoda = input("Digite a frase invertida de Yoda: ")

palavras = frase_yoda.split()
frase_corrigida = ' '.join(reversed(palavras))

print(f"Frase corrigida de Yoda: {frase_corrigida}")

licoes = []
print("\nAgora, compartilhe três lições que você aprendeu como Padawan:")
for i in range(3):
    licao = input(f"Lição {i + 1}: ")
    licoes.append(licao)

print("\nSeus aprendizados como Padawan:")
for i, licao in enumerate(licoes, 1):
    print(f"{i}. {licao}")
