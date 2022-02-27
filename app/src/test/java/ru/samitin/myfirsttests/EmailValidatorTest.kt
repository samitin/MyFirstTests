package ru.samitin.myfirsttests

import org.junit.Test
import org.junit.Assert.*

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_NotDog_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("nameemail.com"))
    }

    @Test
    fun emailValidator_TwoDog_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@@email.com"))
    }
    @Test
    fun emailValidator_NotPoint_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@emailcom"))
    }

    @Test
    fun emailValidator_RussianWord_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("имя@email.com"))
    }
    @Test
    fun emailValidator_equalsString_ReturnTrue(){
        val texttest="text"
        assertEquals(EmailValidator.text, texttest)
    }
    @Test
    fun emailValidator_notEqualsString_ReturnTrue(){
        val texttest="text2"
        assertNotEquals(EmailValidator.text, texttest)
    }
    @Test
    fun emailValidator_arrayEqualsString_ReturnTrue(){
        val texttest= arrayOf("test1","test2","test3")
        assertArrayEquals(EmailValidator.list, texttest)
    }
    @Test
    fun emailValidator_isNull_ReturnTrue(){
        assertNull(EmailValidator.isNull)
    }
    @Test
    fun emailValidator_isNotNull_ReturnTrue(){
        assertNotNull(EmailValidator.text)
    }
    @Test
    fun emailValidator_same_ReturnTrue(){
        assertSame(EmailValidator.text,"text")
    }

}
