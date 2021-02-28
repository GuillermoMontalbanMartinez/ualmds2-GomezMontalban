import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-filtrar-por-categoria`
 *
 * VistaFiltrarPorCategoria element.
 *
 * @customElement
 * @polymer
 */
class VistaFiltrarPorCategoria extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-filtrar-por-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaFiltrarPorCategoria.is, VistaFiltrarPorCategoria);
