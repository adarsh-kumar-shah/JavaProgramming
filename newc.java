object SavedPreference{
    private const val PREF_NAME = "user_pref"
    private const val KEY_EMAIL = "email"
    private const val KEY_USERNAME = "username"
    private const val KEY_PROFILE_PIC = "profile_pic"

    private fun getSharedPreferences(context:Context): getSharedPreferences{
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun setProfilePic(context: Context, profilePic: String){
        val editor = getSharedPreferences(context).edit()
        editor.putString(KEY_PROFILE_PIC, profilePic)
        editor.apply()
    }

    fun setEmail(context: Context, email: String){
        val editor = getSharedPreferences(context).edit()
        editor.putSTring(KEY_EMAIL, email)
        editor.apply()
    }
    fun getEmail(context: Context): String?{
        return getSharedPreferences(context).getString(KEY_EMAIL, null)
    }
    fun setUsername(context: Context, username: String){
        val editor = getSharedPreferences(context).edit()
        editor.putString(KEY_USERNAME, username)
        editor.apply()
    }
    fun getUsername(context: Context):String?{
        return getSharedPreferences(context).getString(KEY_USERNAME, null)
    }
}