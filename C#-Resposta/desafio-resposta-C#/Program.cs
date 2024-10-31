using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite a frase invertida de Yoda:");
        string fraseYoda = Console.ReadLine();

        string[] palavras = fraseYoda.Split(' ');
        Array.Reverse(palavras);
        string fraseCorrigida = string.Join(" ", palavras);

        Console.WriteLine("Frase corrigida de Yoda: " + fraseCorrigida);

        string[] licoes = new string[3];
        Console.WriteLine("\nAgora, compartilhe três lições que você aprendeu como Padawan:");
        for (int i = 0; i < 3; i++)
        {
            Console.Write($"Lição {i + 1}: ");
            licoes[i] = Console.ReadLine();
        }

        Console.WriteLine("\nSeus aprendizados como Padawan:");
        for (int i = 0; i < licoes.Length; i++)
        {
            Console.WriteLine($"{i + 1}. {licoes[i]}");
        }
    }
}
