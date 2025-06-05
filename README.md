# 📝 Simple Blog Platform - Clean Architecture (Java + Spring Boot)

This is a basic blog platform built using **Java**, **Spring Boot**, and following **Uncle Bob’s Clean Architecture** principles. It aims to clearly separate concerns and promote maintainability, scalability, and testability.

---

## 📚 Table of Contents

- [📖 Overview](#-overview)
- [⚙️ Tech Stack](#️-tech-stack)
- [🏛️ Clean Architecture Layers](#️-clean-architecture-layers)
- [📁 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [✅ Features](#-features)
- [🧠 Future Improvements](#-future-improvements)
- [📄 License](#-license)

---

## 📖 Overview

The goal is to build a **minimal but extensible blog platform**. Clean Architecture keeps your business logic completely separate from web frameworks, databases, and UI — allowing flexibility and long-term maintainability.

---

## ⚙️ Tech Stack

- **Java 21+**
- **Spring Boot 3**
- **Maven**
- **In-Memory Storage** (initially)
- ✅ No frameworks in core business logic (domain layer)

---

## 🏛️ Clean Architecture Layers

```
      +-----------------------+
      |     Controllers       |  ← Framework/Driver (Spring MVC)
      +-----------------------+
                ↓
      +-----------------------+
      |     Use Cases         |  ← Application logic (CreatePost, GetPosts)
      +-----------------------+
                ↓
      +-----------------------+
      |   Domain Entities     |  ← Business rules (Post.java)
      +-----------------------+
                ↑
      +-----------------------+
      | Interfaces / Ports    |  ← Abstraction for Repositories, Inputs
      +-----------------------+
```

---

## 📁 Project Structure

```
blogapp/
├── domain/                # Core business models (no Spring)
│   └── Post.java
│
├── usecase/               # Application logic (use cases)
│   └── CreatePostUseCase.java
│
├── ports/
│   ├── input/             # Input interfaces used by controllers
│   └── output/            # Output interfaces used by use cases
│       └── PostRepository.java
│
├── adapters/
│   ├── web/               # Controllers (Spring MVC)
│   └── persistence/       # Data access (in-memory or database)
│
├── application/           # Spring configuration
│   └── AppConfig.java
│
├── BlogAppApplication.java  # Spring Boot main class
└── README.md
```

---

## 🚀 Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/your-username/blogapp.git
cd blogapp
```

### 2. Run the app

Make sure you have Java 21+ and Maven installed.

```bash
./mvnw spring-boot:run
```

The app will run at `http://localhost:8080`.

---

## ✅ Features (Phase 1)

- [x] Create a blog post
- [x] List all blog posts
- [x] Get a post by ID

---

## 🧠 Future Improvements

- [ ] Edit / Delete post
- [ ] Register / login users
- [ ] Add comments
- [ ] Persist data to a real database
- [ ] Add Swagger docs

---

> Built with ❤️  by a Clean Architecture enthusiast.
