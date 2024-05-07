const post = () =>{
    const nome = document.querySelector("#nome").value;
    const email = document.querySelector("#email").value;
    const crm = document.querySelector("#crm").value;
    const senha = document.querySelector("#senha").value;
    const telefone = document.querySelector("#telefone").value;
    const especialidade = document.querySelector("#especialidade").value;
    
    const endereco = {
        cep : document.querySelector("#cep").value,
        logradouro: document.querySelector("#logradouro").value,
        numero: document.querySelector("#numero").value,
        complemento: document.querySelector("#complemento").value,
        bairro: document.querySelector("#bairro").value,
        cidade: document.querySelector("#cidade").value,
        uf: document.querySelector("#uf").value
    };

    const data = {nome, email, crm, senha,telefone, especialidade, endereco}

    axios.post('http://localhost:8080/medicos',data)
    .then(response => {
        console.log('Médico cadastrado com sucesso',response.data)
    })
    .catch(error => {
        console.error('Erro ao Cadastrar o médico', error);
    });
}
document.getElementById('post').addEventListener('click',post);