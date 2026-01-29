import { getClient } from "./utils.js"
async function createTable(){
    // users
    const userTable = `
        CREATE TABLE users (
            id SERIAL PRIMARY KEY,
            email VARCHAR(255) UNIQUE NOT NULL,
            password VARCHAR(255) NOT NULL
        ); `
    const client = await getClient();
    await client.query(userTable)
    // todos
    const todoTable = `
    CREATE TABLE todos (
        id SERIAL PRIMARY KEY,
        title TEXT NOT NULL,
        description TEXT,
        user_id INTEGER REFERENCES users(id) ,
        done BOOLEAN DEFAULT FALSE
    ); `
    await client.query(todoTable);
    console.log("both tables successfully created");
}
createTable()