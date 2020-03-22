Refactoring

SRP
---

Coordination is one responsibility

A class must satisfy the needs of one actor, and that actor only
Actors: final user, external systems, stakeholders, software architects...

----------------------------------------
----------------------------------------

OCP
---

Make your code extensible without the need to modify it!

Abstractions in code, details in data

1 sender, 2 insurance

----------------------------------------
----------------------------------------

LSP
---

Not only about inheritance, it's about meeting the contract too

1 sender, 2 publishing

----------------------------------------
----------------------------------------

ISP
---

Segregate by behaviours or responsibilities

There are many things out there not meeting the ISP, which is not necessarily a bad thing!!!

1 printer, 2 factory

----------------------------------------
----------------------------------------

DIP
---

If we want to change the way our collaborators are doing something, we shouldn't change the class using them

Direction of the arrows

By doing that, we create clear boundaries

You can have dependency injection without dependency inversion

