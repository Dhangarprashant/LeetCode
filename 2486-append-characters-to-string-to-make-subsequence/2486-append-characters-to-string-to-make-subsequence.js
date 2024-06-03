/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var appendCharacters = function(s, t) {
    let i = 0;
    let j = 0;
    
    while (i < s.length) {
        while (i < s.length && s.charAt(i) != t.charAt(j)) {
            i++;
        }
        if (i == s.length) {
            return t.length - j;
        }
        i++;
        j++;
        if (j == t.length) {
            return 0;
        }
    }
    return t.length - j;
};