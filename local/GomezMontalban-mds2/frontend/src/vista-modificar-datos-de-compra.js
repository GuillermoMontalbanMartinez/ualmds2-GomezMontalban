import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-modificar-datos-de-compra`
 *
 * VistaModificarDatosDeCompra element.
 *
 * @customElement
 * @polymer
 */
class VistaModificarDatosDeCompra extends PolymerElement {

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
        return 'vista-modificar-datos-de-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificarDatosDeCompra.is, VistaModificarDatosDeCompra);
