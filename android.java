class RegisterActivity: AppCompatActivity(){
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: BUndle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        title = "Register"

        auth = FirebaseAuth.getInstance()

        var editTextEmailAdress = findViewById<EditText>(R.id.editTextEmailAddress)
        var editTextPassword = findViewById<EditText>(R.id.buttonRegister)
        var buttonLogin = findViewById<Button>(R.id.buttonRegister)

        buttonLogin.setOnClickListener{
            var email1 = editTextEmailAddress.text.toString()
            var pwd1 : String = editTextPassword.text.toString()

            register(email1, pwd1)
        }
    }

    fun register(email1: String, pwd1:String){
        val email = email
        val password = pwd1

        auth.createUserWithEmailAndPassword(email,password).addOnCompleteLIstener { task -> 
        if(task.isSuccessful){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }}.addOnFailureListener {exception ->
        Toast.makeText(applicationContext, exception.localizedMessage, Toast.LENGTH_LONG)
    .show()
}
    }
    fun goToLogin(View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}