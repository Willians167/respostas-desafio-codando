const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite a frase invertida de Yoda: ', (fraseYoda) => {
  const palavras = fraseYoda.split(' ').reverse();
  const fraseCorrigida = palavras.join(' ');

  console.log(`Frase corrigida de Yoda: ${fraseCorrigida}`);

  const licoes = [];
  console.log('\nAgora, compartilhe três lições que você aprendeu como Padawan:');
  
  const pedirLicoes = (i) => {
    if (i < 3) {
      rl.question(`Lição ${i + 1}: `, (licao) => {
        licoes.push(licao);
        pedirLicoes(i + 1);
      });
    } else {
      console.log('\nSeus aprendizados como Padawan:');
      licoes.forEach((licao, index) => {
        console.log(`${index + 1}. ${licao}`);
      });
      rl.close();
    }
  };

  pedirLicoes(0);
});
