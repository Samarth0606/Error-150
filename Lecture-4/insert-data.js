
import { getClient } from "./utils.js"

async function insertData(){

    // users
    const userData = `INSERT INTO users (email,password) VALUES ($1,$2) RETURNING id;`
    const userArr = ['bob@gmail.com','111']
    const client = await getClient()
    const result = await client.query(userData,userArr);
    console.log(result , "result");
    console.log(result.rows[0]);

    // todos
    const todoData = `INSERT INTO todos(title,description,user_id,done) VALUES ($1,$2,$3,$4);`
    const todoArr = ['gym','workout karo',result.rows[0].id,false]
    await client.query(todoData,todoArr);
    console.log('Entreis check krlo');
}
insertData()