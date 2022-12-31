# JavaBankATM
This is a simple ATM made in Java.

<iframe width="560" height="315" src="https://www.youtube.com/embed/dIuU_loGL2s" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

The implemented features are:

- Create Account: This is where users can create their accounts by filling some fields like: "Username", "Identity Number" and "Email". After that, the app generates "User Account ID" and returns information that have been inputed.
- Add funds: Simple method to add funds to user account. User must indicate account ID that will receive funds, if there is no such account ID, or no suficient funds, system returns message: "Your transaction cannot be completed".
- Withdrawal: Simple method to withdrawal. User must indicate Account ID and then input value to withdrawal. If ID wasn't created, doesn't exist, or there is no suficient funds to withdrawal, system returns message: "Your transaction cannot be completed".
- Transfer: User must indicate "Sender ID" and "Receiver ID", then, input value to transfer. If any of both IDs have not been created yet, or there is no suficient funds to transfer, the system will return the message: "Your transaction cannot be completed".
- List: This will list each created Account and its information (Username, Identity Number, Email, Funds).
- Close. End application.
