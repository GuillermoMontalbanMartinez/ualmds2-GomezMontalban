import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-mas-vendido`
 *
 * VistaProductoMasVendido element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoMasVendido extends PolymerElement {

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
        return 'vista-producto-mas-vendido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoMasVendido.is, VistaProductoMasVendido);
