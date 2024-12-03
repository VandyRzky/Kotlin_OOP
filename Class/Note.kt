package Class

class Note (titleParam: String, val bigTitleParam: String) {
    var title: String = titleParam
        get() {
          return field
        }
        set(value) {
            if (value.isNotBlank()){
                field = value
            }
        }
    var name: String? = null
        get(){
            if (field!= null){
                return field
            }
            return "Kosong"
        }
        set(value) {
            if (value != null && value.isNotBlank()){
                field = value
            }
        }

    val bigTitle: String
        get() = bigTitleParam
}