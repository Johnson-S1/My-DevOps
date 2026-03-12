#!/usr/bin/env node
const readline = require("readline");
const { MongoClient } = require("mongodb");

const uri = process.env.MONGO_URI; 
const client = new MongoClient(uri);

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function askQuestion(query) {
  return new Promise(resolve => rl.question(query, answer => resolve(answer)));
}

async function main() {
  try {
    await client.connect();
    const db = client.db("userDB");
    const collection = db.collection("users");

    console.log("👋 Welcome! Let's collect your details.\n");

    const name = await askQuestion("👉 Please enter your full name: ");
    const age = await askQuestion("🎂 How old are you? ");
    const email = await askQuestion("📧 What's your email address? ");

    const userData = { name, age: parseInt(age), email };

    const result = await collection.insertOne(userData);
    console.log("\n✅ Data saved successfully with ID:", result.insertedId);

  } catch (err) {
    console.error("❌ Error:", err);
  } finally {
    rl.close();
    await client.close();
  }
}

main();

