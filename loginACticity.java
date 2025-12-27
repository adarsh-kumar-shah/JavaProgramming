class LoginActivity : AppCompatACtivity(){
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="Login"
        auth = FirebaseAuth.getInstance()
        var editTextEmailAddress = findViewById<EditText>(R.id.editTextEmailAddress)
        var editTextPassword = findViewById<EditTExt>(R.id.editTextPassword)
        var buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setONClickLIstener{
            var email = editTextEmailAddress.text.toSTring()
            var pwd1 String = editTextPassword.text.toString()

            login(email,pwd1)
        }
    }
    fun login(email1: String, pwd1:String){
        val email = email1
        val password = pwd1
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {task ->
        if(task.isSuccessful){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }}.addOnFailureListener{exception ->
        Toast.makeText(applicationContext, exception.localizedMessage, Toast.LENGTH_LONG).show()}
    }
}