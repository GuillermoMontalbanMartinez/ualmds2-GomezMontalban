import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `encargado-de-compras`
 *
 * EncargadoDeCompras element.
 *
 * @customElement
 * @polymer
 */
class EncargadoDeCompras extends PolymerElement {

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
        return 'encargado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(EncargadoDeCompras.is, EncargadoDeCompras);
