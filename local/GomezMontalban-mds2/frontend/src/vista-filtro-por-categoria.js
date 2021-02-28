import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-filtro-por-categoria`
 *
 * VistaFiltroPorCategoria element.
 *
 * @customElement
 * @polymer
 */
class VistaFiltroPorCategoria extends PolymerElement {

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
        return 'vista-filtro-por-categoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaFiltroPorCategoria.is, VistaFiltroPorCategoria);
