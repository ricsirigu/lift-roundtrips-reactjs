package code.model

/**
  * Created by Riccardo Sirigu on 19/04/2017.
  */
case class Article(id: Long, name: String)

object ArticleFactory{
  def build: List[Article] = {
    List(
      Article(1, "Spaghetti"),
      Article(2, "Riso Venere"),
      Article(3, "Cous cous"),
      Article(4, "Pollo"),
      Article(5, "Scamorza"),
      Article(6, "Mela")
    )
  }
}
